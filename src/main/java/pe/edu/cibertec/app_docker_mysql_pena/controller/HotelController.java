package pe.edu.cibertec.app_docker_mysql_pena.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("api/v1/test")
public class HotelController {
    @GetMapping("")
    public String mensajeBienvenida(){
        log.info("API REST Microservicio Hotel testeo");
        return "¡Bienvenido al microservicio de gestión de Hotel";
    }
}
