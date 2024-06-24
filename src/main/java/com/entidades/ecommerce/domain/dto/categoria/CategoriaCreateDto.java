package com.entidades.ecommerce.domain.dto.categoria;


import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.sucursal.SucursalShortDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaCreateDto extends BaseDto {

    private String denominacion;
    private Set<SubCategoriaFullDto> subCategorias;
    private Set<SucursalShortDto> sucursales;
    private boolean esInsumo;
}
