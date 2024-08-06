package com.cba.utils;

import com.cba.pojos.Pet;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

public class Common {
    Logger logger
            = Logger.getLogger(
            Common.class.getName());

    private List<Pet> findPetByIdRequest;
    private String id;

    public void printLog(String logContent) {
        logger.info(logContent);
    }

    public void printLog(String logName, String logContent) {
        logger.info(logName + " : " + logContent);
    }

    public List<Pet> readFile(String file, String scenario) throws IOException {
        Path filePath = Paths.get(Globals.DATA_FILES_PATH, file);
        ObjectMapper objectMapper = new ObjectMapper();
        findPetByIdRequest = objectMapper.readValue(filePath.toFile(), new TypeReference<List<Pet>>(){});
        return findPetByIdRequest;
    }
}
