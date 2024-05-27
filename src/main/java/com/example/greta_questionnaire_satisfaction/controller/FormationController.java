package com.example.greta_questionnaire_satisfaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.greta_questionnaire_satisfaction.entity.Formation;
import com.example.greta_questionnaire_satisfaction.service.FormationService;

@RestController
@RequestMapping("/api/Formations")
public class FormationController {

 @Autowired
 private FormationService formationService;

 @GetMapping
 public List<Formation> getAllFormations() {
 return formationService.getAllFormations();
 }

 @GetMapping("/{id}")
 public Formation getFormationById(@PathVariable Long id) {
 return formationService.getFormationById(id);
 }

 @PostMapping
 public Formation addFormation(@RequestBody Formation Formation) {
 return formationService.addFormation(Formation);
 } 
 
 @DeleteMapping("/{id}")
 public void deleteFormation(@PathVariable Long id) {
 formationService.deleteFormation(id);
 }

 @PutMapping("/{id}")
 public Formation updateFormation(@PathVariable Long id, @RequestBody Formation updatedFormation) {
     return formationService.updatePerson(id, updatedFormation);
 }    

 
}
