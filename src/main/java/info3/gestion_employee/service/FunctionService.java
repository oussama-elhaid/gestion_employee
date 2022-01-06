package info3.gestion_employee.service;

import info3.gestion_employee.model.Function;
import info3.gestion_employee.repository.FunctionRepository;
import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    
    final 
    FunctionRepository FunctionRepository;

    public FunctionService(FunctionRepository functionRepository) {
        FunctionRepository = functionRepository;
    }
    public Function add(Function function){return FunctionRepository.save(function);}
    public Function update(Function function){return FunctionRepository.save(function);}
    public void delete(Function function){ FunctionRepository.delete(function);}
}
