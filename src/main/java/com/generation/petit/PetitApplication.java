package com.generation.petit;

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

		/*List<Vaccines> vacunas = new ArrayList<>();
		vaccinesRepository.findAll().forEach(vacunas::add);

		Pet pet = petRepository.findById(1).get();

		pet.setPetVaccines(vacunas);
		petRepository.save(pet);*/


	}

}
