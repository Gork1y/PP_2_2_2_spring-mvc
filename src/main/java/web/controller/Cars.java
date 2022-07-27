package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import web.dao.CarDao;

@Controller

public class Cars {
    private final CarDao carDao;

    @Autowired
    public Cars(CarDao carDao) {
        this.carDao = carDao;
    }
    @GetMapping()
    public String index(Model model) {
    model.addAttribute("car", carDao.getCarList());
    return "cars";
    }
//    @GetMapping("/{model}")
//    public String show(@PathVariable("model") String modelofcar, Model model){
//    model.addAttribute("car", carDao.show(modelofcar));
//    return "cars";
//
//    }

//    @GetMapping("/cars")
//    public String getModel(@RequestParam(value = "city", required = false) String city,
//                           @RequestParam(value = "model", required = false) String modelofcar,
//                           @RequestParam(value = "series", required = false) int series,
//                           Model model) {
//
//
//        // System.out.println("Мы создали машинку:" + " " + model + " которая сделана в :" + " " + countryOfbuilding);
//        model.addAttribute("city", city);
//        model.addAttribute("model", modelofcar);
//        model.addAttribute("series", series);
//
//        return "cars";
//    }
}
