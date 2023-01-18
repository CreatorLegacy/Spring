package com.SpringCore.annotaion.dependency;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Value("Excide")
	int name;

}
