package wcci.simplejpademo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@Resource
	CustomerRepository customerRepo;

	@RequestMapping("/customers")
	public String showAllCustomers(Model model) {
		model.addAttribute("customers", customerRepo.findAll());
		return "customers";
	}

//	@RequestMapping("/sorted-customers")
//	public String showAllCustomersSorted(Model model) {
//		model.addAttribute("customers", customerRepo.findAllByOrderByLastNameAsc());
//		return "customers";
//	}
//
//	@RequestMapping("/sorted-three")
//	public String showThreeCustomersSorted(Model model) {
//		model.addAttribute("customers", customerRepo.findFirst3ByOrderByLastNameAsc());
//		return "customers";
//	}

}