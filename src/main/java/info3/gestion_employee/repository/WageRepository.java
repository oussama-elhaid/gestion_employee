package info3.gestion_employee.repository;

import info3.gestion_employee.model.Wage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WageRepository extends JpaRepository<Wage,Long> {
}
