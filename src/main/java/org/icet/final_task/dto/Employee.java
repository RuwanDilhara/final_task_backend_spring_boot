package org.icet.final_task.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    @NotNull
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String department;

    @NotNull
    private LocalDate createAt = LocalDate.now()    ;

    @NotNull
    private LocalDate updateAt;

}
