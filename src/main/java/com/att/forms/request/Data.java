package com.att.forms.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Data {
    private String idTemplate;
    private String key;
    private Long idItemServer;
    private String flavor;
    private String name;
    private String description;
    private Boolean status;
    private String nics;
    private String volumes;
}
