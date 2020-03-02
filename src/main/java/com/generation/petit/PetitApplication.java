package com.generation.petit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.generation.petit.Models.Pet;
import com.generation.petit.Models.PetVaccines;
import com.generation.petit.Models.Vaccines;
import com.generation.petit.Repositories.ClientRepository;
import com.generation.petit.Repositories.PetRepository;
import com.generation.petit.Repositories.UserRepository;
import com.generation.petit.Repositories.VaccinesRepository;
import com.generation.petit.Repositories.VeterinaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetitApplication implements CommandLineRunner {

	/*@Autowired
	private VaccinesRepository vaccinesRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private VeterinaryRepository veterinaryRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PetRepository petRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(PetitApplication.class, args);

	}

	@Override
	public void run(String... args) {
		// vaccinesRepository.save(new Vaccines("antirrabica"));
		// vaccinesRepository.save(new Vaccines("quintuple"));

		// clientRepository.save(new Client("Maria", new Date(), "Calle No me mires #
		// 150, Abaluz, Jalisco", "81-19-13-45"));

		// veterinaryRepository.save(new Veterinary("Guauguau", "Calle No veo # 23, En
		// la sierra, Jalisco", "34-56-78-23", "vet_photo", "vet_rating"));
		//Optional<Client> maria = clientRepository.findById(1);
		//Optional<Veterinary> gua = veterinaryRepository.findById(1);
		/*if(maria.isPresent()){
			userRepository.save(new User("bdfhjdfhsdfjh", new Date(), "maria@gmail.com", maria.get(), null));
		}*/
		
		//petRepository.save(new Pet("Nancy", "Callejero", "Hembra", "Cafe", 
		 //new Date(), 3 , "Azul", "Con manchas blancas", "petPhoto", maria.get(), gua.get()));

		/*Vaccines v1 = vaccinesRepository.findById(2).get();

		Pet pet = petRepository.findById(8).get();

		PetVaccines pv = new PetVaccines();
		pv.setVaccines(v1);
		pv.setDate(new Date());

		pet.addPetVaccine(pv);
		petRepository.save(pet);*/


	}

}
