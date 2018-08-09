package cn.nwsuaf.edu.srms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProParts {
    private Integer id;

    private String name;

    private String specification;

    private Integer platId;

}