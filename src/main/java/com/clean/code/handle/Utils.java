package com.clean.code.handle;

import com.clean.code.model.Contact;
import com.clean.code.model.InputConact;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils {

    public static List<InputConact> handleInputFile() throws Exception {

        String inputPath = "/home/ces-user/Desktop/com.test.java/input/contact.txt";
        InputStream fileInputStream  = new FileInputStream(inputPath);
        char[] data = new char[100000];
        int currentCharacter;
        int totalCharacters = 0;

        while ((currentCharacter = fileInputStream.read()) != -1) {
            data[totalCharacters] = (char) currentCharacter;
            totalCharacters++;
        }

        String fileString = new String(data, 0, totalCharacters);

        String[] lines = fileString.split("\n");

        return Arrays.stream(lines)
                .skip(1)
                .map(Utils::convertLineToContact)
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(contact -> Integer.parseInt(contact.getZipCode())))
                .collect(Collectors.toList());
    }


    private static InputConact convertLineToContact(String line){

        if (line.trim().length() == 0) {
            return null;
        }

        String[] data = line.split("\t");

        if (data.length != 14) { // invalid line format
            return null;
        }

        InputConact contact = new InputConact();
        contact.setId(Integer.parseInt(data[0]));
        contact.setFirstName(data[1]);
        contact.setLastName(data[2]);
        contact.setCompanyName(data[3]);
        contact.setDayOfBirth(data[4]);
        contact.setAddress(data[5]);
        contact.setCity(data[6]);
        contact.setCountry(data[7]);
        contact.setState(data[8]);
        contact.setZipCode(data[9]);
        contact.setMobilePhone(data[10]);
        contact.setPhone2(data[11]);
        contact.setEmail(data[12]);
        contact.setWebsite(data[13]);

        return contact;
    }

}
