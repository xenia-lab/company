package ru.profile.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.profile.dto.CompanyRequestDTO;
import ru.profile.dto.CompanyResponseDTO;
import ru.profile.mapper.CompanyMapper;
import ru.profile.model.Company;
import ru.profile.service.CompanyService;

@Validated
@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;
    private final CompanyMapper companyMapper;

    @GetMapping("/get/{id}")
    public ResponseEntity<CompanyResponseDTO> getCompany(@PathVariable("id") Long id) {
        return new ResponseEntity<>(companyMapper.toCompanyResponseDTO(companyService.getCompany(id)), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Long> addCompany(@Valid @RequestBody CompanyRequestDTO companyRequestDTO){
        return new ResponseEntity<>(
                companyService.addCompany(companyMapper.toCompany(companyRequestDTO)), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable("id") Long id){
        companyService.deleteCompany(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Long> updateCompany(@PathVariable("id")Long id,
                                              @RequestBody CompanyRequestDTO companyRequestDTO) {
        return new ResponseEntity<>(
                companyService.putCompany(id, companyMapper.toCompany(companyRequestDTO)), HttpStatus.OK);
    }
}
