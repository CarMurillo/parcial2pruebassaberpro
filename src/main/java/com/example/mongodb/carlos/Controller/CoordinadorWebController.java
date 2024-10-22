package com.example.mongodb.carlos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mongodb.carlos.Entity.Estudiante;
import com.example.mongodb.carlos.Entity.EstudianteService;
import com.example.mongodb.carlos.exception.NotFoundException;
import com.example.mongodb.carlos.Repository.EstudianteRepository;



@Controller
@RequestMapping(value = "estudiante")

public class CoordinadorWebController {
	@Autowired
    private EstudianteRepository estudianteRepository;

	
	  @GetMapping("/")
	    public String estudianteListTemplate(Model model) {
	        model.addAttribute("estudiante", estudianteRepository.findAll());
	        return "estudiante-list";	
	    }

	    @GetMapping("/new")
	    public String estudianteNewTemplate(Model model) {
	        model.addAttribute("estudiante", new Estudiante());
	        return "estudiante-form";
	    }

	    @GetMapping("/edit/{id}")
	    public String estudianteEditTemplate(@PathVariable("id") String id, Model model) {
	        model.addAttribute("estudiante",estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
	        return "estudiante-form";
	    }
	    @GetMapping("/view/{id}")
	    public String estudianteViewTemplate(@PathVariable("id") String id, Model model) {
	        Estudiante estudiante = estudianteRepository.findById(id)
	            .orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
	        model.addAttribute("estudiante", estudiante);
	        return "estudiantes-informacion"; // Asegúrate de tener este template HTML
	    }


	    @PostMapping("/save")
	    public String estudianteSaveProcess(@ModelAttribute("estudiante") Estudiante estudiante) {
	        if (estudiante.getId().isEmpty()) {
	        	estudiante.setId(null);
	        }
	        estudianteRepository.save(estudiante);
	        return "redirect:/estudiante/";
	    }

	    @GetMapping("/delete/{id}")
	    public String estudianteDeleteProcess(@PathVariable("id") String id) {
	    	estudianteRepository.deleteById(id);
	        return "redirect:/estudiante/";
	    }
	    
	    @Controller
		@RequestMapping("/coordinador")
		public class CoordinadorController {

		    @Autowired
		    private EstudianteService estudianteService;

		    @GetMapping("/promedios")
		    public String mostrarPromedios(Model model) {
		        double promedioTotal = estudianteService.calcularPromedioTotal();
		        double promedioComunicacion = estudianteService.calcularPromedioPorPrueba(Estudiante::getComunicacionescrita);
		        double promedioRazonamiento = estudianteService.calcularPromedioPorPrueba(Estudiante::getRazonamiento);
		        double promedioLectura = estudianteService.calcularPromedioPorPrueba(Estudiante::getLectura);
		        double promedioCompetenciasciudadanas = estudianteService.calcularPromedioPorPrueba(Estudiante::getCompetencias);
		        double promedioIngles = estudianteService.calcularPromedioPorPrueba(Estudiante::getIngles);
		        double promedioFormulacionproyectos = estudianteService.calcularPromedioPorPrueba(Estudiante::getFormulacionproyectos);
		        double promedioPensamientocientifico = estudianteService.calcularPromedioPorPrueba(Estudiante::getPensamiento);
		        double promedioDiseño = estudianteService.calcularPromedioPorPrueba(Estudiante::getDiseño);
		        
		        model.addAttribute("promedioTotal", promedioTotal);
		        model.addAttribute("promedioComunicacion", promedioComunicacion);
		        model.addAttribute("promedioRazonamiento", promedioRazonamiento);
		        model.addAttribute("promedioLectura", promedioLectura);
		        model.addAttribute("promedioCompetenciasciudadanas", promedioCompetenciasciudadanas);
		        model.addAttribute("promedioIngles", promedioIngles);
		        model.addAttribute("promedioFormulacionproyectos", promedioFormulacionproyectos);
		        model.addAttribute("promedioPensamientocientifico", promedioPensamientocientifico);
		        model.addAttribute("promedioDiseño", promedioDiseño);

		        return "promedios-estudiantes"; 
		    }
		}
	    
	}

