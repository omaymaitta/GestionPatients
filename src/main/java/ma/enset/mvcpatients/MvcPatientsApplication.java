package ma.enset.mvcpatients;

import ma.enset.mvcpatients.entities.Patient;
import ma.enset.mvcpatients.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MvcPatientsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcPatientsApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (PatientRepository patientRepository) {
        return args -> {
          patientRepository.save(new Patient(null,"Omayma",new Date(),false,15));
          patientRepository.save(new Patient(null,"Mohamed",new Date(),true,12));
          patientRepository.save(new Patient(null,"Khalid",new Date(),false,16));
          patientRepository.save(new Patient(null,"Hanan",new Date(),true,18));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });



        };
    }
}
