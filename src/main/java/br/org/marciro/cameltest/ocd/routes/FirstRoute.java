package br.org.marciro.cameltest.ocd.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FirstRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("")
		.to("");

	}

}
