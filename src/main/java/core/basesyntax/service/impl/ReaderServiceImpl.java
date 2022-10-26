package core.basesyntax.service.impl;

import core.basesyntax.service.ReaderService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    private static final String exceptionMessage = "Can't get the info from the file path ";

    @Override
    public List<String> readFromFile(String pathFromFile) {
        try {
            List<String> list = Files.readAllLines(
                    Path.of(pathFromFile));
            list.remove(0);
            return list;
        } catch (IOException e) {
            throw new RuntimeException(exceptionMessage + pathFromFile, e);
        }
    }
}