package io.github.GeraldoJunior2017.cm.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.GeraldoJunior2017.cm.entities.Owner;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OwnerDto implements Serializable {

    private static final long serialVersionUID = 8739872568363885681L;
    @JsonProperty("código")
    private final Long id;
    @JsonProperty(value = "cpf", required = true)
    private final String cpf;
    @JsonProperty(value = "nome", required = true)
    private final String name;

    public OwnerDto(Owner owner) {
        id = owner.getId();
        cpf = owner.getCpf();
        name = owner.getName();
    }
}
