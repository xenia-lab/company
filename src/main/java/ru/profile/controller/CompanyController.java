package ru.profile.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.profile.model.Company;
import ru.profile.service.CompanyService;

@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/get/{id}")
    public Company getCompany(@PathVariable("id") Long id) {
        return companyService.getCompany(id);
    }

    @PostMapping("")
    public Long addCompany(@RequestBody Company company){
        return companyService.addCompany(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable("id") Long id){
        companyService.deleteCompany(id);
    }
}
