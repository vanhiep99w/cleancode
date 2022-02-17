package com.clean.code.constant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Constans {

    public static final Set<String> VALID_ZIP_CODES =
            new HashSet<>(Arrays.asList(
                    "AL","AK","AS","AZ","AR",
                    "CA","CO","CT","DE","DC","FL",
                    "GA","GU","HI","ID","IL","IN",
                    "IA","KS","KY","LA","ME","MD",
                    "MH","MA","MI","FM","MN","MS",
                    "MO","MT","NE","NV","NH","NJ",
                    "NM","NY","NC","ND","MP","OH",
                    "OK","OR","PW","PA","PR","RI",
                    "SC","SD","TN","TX","UT","VT",
                    "VA","VI","WA","WV","WI","WY"));

    public static int REPORT_YEAR = 2016;
}
