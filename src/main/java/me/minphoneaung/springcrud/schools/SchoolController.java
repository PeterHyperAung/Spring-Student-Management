package me.minphoneaung.springcrud.schools;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/schools")
public class SchoolController {


    private final SchoolService service;

    public SchoolController(SchoolService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    private String helloworld() {
        return "hello world";
    }

    @GetMapping
    private List<SchoolDto> getSchools() {
        return service.getAllSchools();
    }

    @GetMapping("/{id}")
    private SchoolDto getSchool(@PathVariable Integer id) {
        return service.getSchoolById(id);
    }

    @PostMapping
    private SchoolDto getSchool(@RequestBody SchoolDto dto) {
        return service.createSchool(dto);
    }

    @PatchMapping("/{id}")
    private SchoolDto updateSchool(@PathVariable Integer id, @RequestBody SchoolDto body) {
        return service.updateSchoolById(id, body);
    }

    @DeleteMapping("{id}")
    private void deleteSchool(@PathVariable Integer id) {
        service.deleteSchoolById(id);
    }

}