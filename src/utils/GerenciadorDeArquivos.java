package utils;
// GerenciadorDeArquivos.java
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class GerenciadorDeArquivos {
    public static List<String> lerDados(String fileName) throws IOException {
        try {
            Path path = getOrCreateResourceFile(fileName);
            return Files.readAllLines(path);
        } catch (Exception e) {
            throw new IOException("Erro ao acessar o arquivo: " + fileName, e);
        }
    }

    public static void escreverDados(String fileName, List<String> novosDados) throws IOException {
        try {
            Path path = getOrCreateResourceFile(fileName);

            // Read existing data
            List<String> dadosExistentes = Files.readAllLines(path);

            // Merge without duplicates
            Set<String> conjuntoDados = new LinkedHashSet<>(dadosExistentes);
            conjuntoDados.addAll(novosDados); // Add only unique entries

            // Write back merged data
            Files.write(path, conjuntoDados, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (Exception e) {
            throw new IOException("Erro ao acessar o arquivo: " + fileName, e);
        }
    }

    private static Path getOrCreateResourceFile(String fileName) throws IOException {
        // Locate the resources folder
        Path resourcesPath = Paths.get("src/resources");
        if (!Files.exists(resourcesPath)) {
            Files.createDirectories(resourcesPath); // Create the resources directory if it doesn't exist
        }

        // Locate the specific file
        Path filePath = resourcesPath.resolve(fileName);
        if (!Files.exists(filePath)) {
            Files.createFile(filePath); // Create the file if it doesn't exist
        }

        return filePath;
    }
}
