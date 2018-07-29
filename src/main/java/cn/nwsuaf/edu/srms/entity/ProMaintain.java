package cn.nwsuaf.edu.srms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProMaintain {
    private Integer id;

    private String name;

    @JsonIgnore
    private Integer platId;

}