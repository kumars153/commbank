package com.cba.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Pet {
    public String scenario;
    public String id;
    public String name;
    public Category category;
    public ArrayList<String> photoUrls;
    public ArrayList<Tag> tags;
    public String status;
    public int code;
    public String type;
    public String message;
}
