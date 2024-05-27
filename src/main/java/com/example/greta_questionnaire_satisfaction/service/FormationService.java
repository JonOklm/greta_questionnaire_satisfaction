package com.example.greta_questionnaire_satisfaction.service;

import org.springframework.stereotype.Service;


import com.example.greta_questionnaire_satisfaction.entity.Formation;
import com.example.greta_questionnaire_satisfaction.repository.FormationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {
    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    public Formation getFormationById(Long id) {
        return formationRepository.findById(id).orElse(null);
    }

    public Formation addFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }

    public Formation updatePerson(Long id, Formation updatedFormation) {
        Optional<Formation> existingFormation = formationRepository.findById(id);
        if (existingFormation.isPresent()) {
            Formation formation = existingFormation.get();
            // Mise à jour des champs
            formation.setNomFormation(updatedFormation.getNomFormation());
            formation.setDescription(updatedFormation.getDescription());
            formation.setDate_fin(updatedFormation.getDate_debut());
            formation.setDate_fin(updatedFormation.getDate_fin());
            return formationRepository.save(formation);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    
}
}

