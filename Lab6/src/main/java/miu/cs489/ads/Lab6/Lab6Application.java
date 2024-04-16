package miu.cs489.ads.Lab6;

import miu.cs489.ads.Lab6.module.*;
import miu.cs489.ads.Lab6.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

@SpringBootApplication
public class Lab6Application implements CommandLineRunner {
	private IAddressService iAddressService;
	private IDentistService iDentistService;
	private ISurgeryService iSurgeryService;
	private IPatientService iPatientService;

	private IAppointmentService iAppointmentService;

	public Lab6Application(IAddressService iAddressService, IDentistService iDentistService, ISurgeryService iSurgeryService, IPatientService iPatientService, IAppointmentService iAppointmentService) {
		this.iAddressService = iAddressService;
		this.iDentistService = iDentistService;
		this.iSurgeryService = iSurgeryService;
		this.iPatientService = iPatientService;
		this.iAppointmentService = iAppointmentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Address address1=iAddressService.save(new Address("204 E Madison","Fairfield","IA","52556"));
//		Address address2=iAddressService.save(new Address("MIU","Fairfield","IA","52557"));
//
//		Dentist dentist1 = iDentistService.save(new Dentist("Tony","Smith","319-217-9113","nomail@gmail.com","Root Canal"));
//		Dentist dentist2 = iDentistService.save(new Dentist("Helen","Pearson","123-147-7894","abc@face.mn","Orthodontist"));
//		Dentist dentist3 = iDentistService.save(new Dentist("Robin","Plevin","999-777-1234","face@gmail.com","Oral Surgeon"));
//
//		Surgery surgery1 = iSurgeryService.save(new Surgery("S15","Veneer",address1));
//		Surgery surgery2 = iSurgeryService.save(new Surgery("S10","Root Canal Therapy",address2));
//
//		Patient patient1 = iPatientService.save(new Patient("P100","Gillian","White","319-217-9113", LocalDate.now(),50.1,address1));
//		Patient patient2 = iPatientService.save(new Patient("P105","Jill","Bell","111-123-1111",LocalDate.now(),120.0,address2));
//		Patient patient3 = iPatientService.save(new Patient("P108","Ian","McKay","333-222-7777",LocalDate.now(),15.9,address2));
//		Patient patient4 = iPatientService.save(new Patient("P110","John","Walker","444-444-4444",LocalDate.now(),14.0,address2));
//
//		Appointment appointment1 = iAppointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient1,surgery2,dentist1));
//		Appointment appointment2 = iAppointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient2,surgery2,dentist1));
//		Appointment appointment3 = iAppointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient3,surgery1,dentist2));
//		Appointment appointment4 = iAppointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient3,surgery1,dentist2));
//		Appointment appointment5 = iAppointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient2,surgery2,dentist3));
//		Appointment appointment6 = iAppointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient4,surgery2,dentist3));
//		iAppointmentService.getAllAppointment().forEach(System.out::println);
//
//		System.out.println("Before update firstName of a patient");
//		// Update patient
//		patient4.setFirstName("Buyantugs");
//		Patient updatedPatient = iPatientService.update(patient4.getId(), patient4);
//		System.out.println("Updated Patient: " + updatedPatient);
//
//		iAppointmentService.getAllAppointment().forEach(System.out::println);
//
//		Dentist dentist4 = iDentistService.save(new Dentist("Robin","Plevin","999-777-1234","face@gmail.com","Oral Surgeon"));
//		iDentistService.getAllDentists().forEach(System.out::println);
//
//		// Delete patient
//		iDentistService.delete(dentist4.getId());
//		iDentistService.getAllDentists().forEach(System.out::println);
//		System.out.println("Patient deleted successfully.");

	}
}
