package cn.nwsuaf.edu.srms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProInstrument {
    private Integer id;

    private Long number;

    private String name;

    private Integer userId;

    private Integer platId;

}