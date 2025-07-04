/*
 * CypressTestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * OAuthScopeOAuthACGEnum to be used.
 */
public enum OAuthScopeOAuthACGEnum {
    ENUM_FILE_REQUESTSREAD,

    ZAHRA,

    TEST1,

    SELECTION;


    private static TreeMap<String, OAuthScopeOAuthACGEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_FILE_REQUESTSREAD.value = "file_requests.read";
        ZAHRA.value = "zahra";
        TEST1.value = "test1";
        SELECTION.value = "selection";

        valueMap.put("file_requests.read", ENUM_FILE_REQUESTSREAD);
        valueMap.put("zahra", ZAHRA);
        valueMap.put("test1", TEST1);
        valueMap.put("selection", SELECTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OAuthScopeOAuthACGEnum constructFromString(String toConvert) throws IOException {
        OAuthScopeOAuthACGEnum enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static OAuthScopeOAuthACGEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OAuthScopeOAuthACGEnum values to list of string values.
     * @param toConvert The list of OAuthScopeOAuthACGEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OAuthScopeOAuthACGEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OAuthScopeOAuthACGEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 