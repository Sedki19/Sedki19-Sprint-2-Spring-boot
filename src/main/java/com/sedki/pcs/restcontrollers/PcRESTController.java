package com.sedki.pcs.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sedki.pcs.entities.Pc;
import com.sedki.pcs.service.PcService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PcRESTController {

    @Autowired
    PcService pcService;

    @GetMapping("/all")
    public List<Pc> getAllPcs() {
        return pcService.getAllPcs();
    }

    @GetMapping("/getbyid/{id}")
    public Pc getPcById(@PathVariable("id") Long id) {
        return pcService.getPc(id);
    }

    @PostMapping("/addpc")
    public Pc createPc(@RequestBody Pc pc) {
        return pcService.savePc(pc);
    }

    @PutMapping("/updatepc")
    public Pc updatePc(@RequestBody Pc pc) {
        return pcService.updatePc(pc);
    }

    @DeleteMapping("/delpc/{id}")
    public void deletePc(@PathVariable("id") Long id) {
        pcService.deletePcById(id);
    }

    @GetMapping("/pcsparmarque/{idMarq}")
    public List<Pc> getPcsByMarqueId(@PathVariable("idMarq") Long idMarq) {
        return pcService.findByMarqueIdMarq(idMarq);
    }
}
