package com.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.dto.ShopDto;
import com.example.model.Shop;

@Mapper(implementationPackage = "mapper.impl")
public interface ShopMapper {
	
	@Mappings({@Mapping(target = "pickUpAddress", source = "shopDto.address")})
	Shop shopDtoToShop(ShopDto shopDto);
	
	@Mappings({@Mapping(target = "address", source = "shop.pickUpAddress")})
	ShopDto shopToShopDto(Shop shop);

}
