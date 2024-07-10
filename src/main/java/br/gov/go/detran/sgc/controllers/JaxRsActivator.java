package br.gov.go.detran.sgc.controllers;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/rest")
public class JaxRsActivator extends ResourceConfig {}
