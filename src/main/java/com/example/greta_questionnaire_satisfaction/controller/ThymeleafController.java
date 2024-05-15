package com.example.greta_questionnaire_satisfaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.greta_questionnaire_satisfaction.entity.Formation;
import com.example.greta_questionnaire_satisfaction.service.FormationService;



@Controller
public class ThymeleafController {

 @Autowired
 private FormationService formationService;

 
 
 @GetMapping("/list")
 public String showPersonList(Model model) {
 List<Formation> formation = formationService.getAllFormations();
 model.addAttribute("formation", formation);
 return "FormationList";
 }

 @GetMapping("/add")
 public String showAddFormationForm(Model model) {
 model.addAttribute("formation", new Formation());
 return "addEditFormations";
 }
 @GetMapping("/edit/{id}")
 public String showEditPersonForm(@PathVariable Long id, Model model) {
Formation formation = formationService.getFormationById(id);
model.addAttribute("formation", formation);
 return "addEditFormation";
 }
 @PostMapping("/save")
 public String savePerson(@ModelAttribute Formation formation) {
 formationService.addFormation(formation);
 return "redirect:/list";
 }
 @GetMapping("/delete/{id}")
 public String deleteFormation(@PathVariable Long id) {
 formationService.deleteFormation(id);
 return "redirect:/list";
 }
}

