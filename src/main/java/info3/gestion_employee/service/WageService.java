package info3.gestion_employee.service;

import info3.gestion_employee.model.Wage;
import info3.gestion_employee.repository.WageRepository;
import org.springframework.stereotype.Service;

@Service
public class WageService {
    final WageRepository WageRepository;

    public WageService(info3.gestion_employee.repository.WageRepository wageRepository) {
        WageRepository = wageRepository;
    }
    public Wage add(Wage wage){return WageRepository.save(wage);}
    public Wage update(Wage wage){return WageRepository.save(wage);}
    public void delete(Wage wage){ WageRepository.delete(wage);}
}
