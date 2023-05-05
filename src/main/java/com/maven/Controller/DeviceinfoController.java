package com.maven.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.maven.model.Deviceinfo_notsecret;
import com.maven.model.Deviceinfo_secret;
import com.maven.model.Devicetransfer;
import com.maven.model.Devicetype;
import com.maven.model.Maintainrecord;
import com.maven.model.Receiverinfo;
import com.maven.service.Deviceinfo_notsecretService;
import com.maven.service.Deviceinfo_secretService;
import com.maven.service.DevicetransferService;
import com.maven.service.DevicetypeService;
import com.maven.service.MaintainrecordService;
import com.maven.service.ReceiverinfoService;

@Controller
@RequestMapping("/deviceinfo")
public class DeviceinfoController {
	
//	设备类型service注入
	@Autowired 
	DevicetypeService devicetypeService;
	
//	维修人service注入
	@Autowired 
	ReceiverinfoService receiverinfoService;
	
//	台账service注入(涉密)
	@Autowired
	Deviceinfo_secretService deviceinfo_secretService;
//	台账service注入(非涉密)
	@Autowired
	Deviceinfo_notsecretService deviceinfo_notsecretService;

//	故障申报service注入
	@Autowired
	MaintainrecordService maintainrecordService;

//	设备移交service注入
	@Autowired
	DevicetransferService devicetransferService;

	@RequestMapping("/one")
	public String one(Model model) {
		//设备类型查询
   		List<Devicetype> devicetype = devicetypeService.findAll();
   		model.addAttribute("devicetype", devicetype);
   		return "../static/xadmin/standingbook-secret";
	}
	@RequestMapping("/onenotsecret")
	public String onenotsecret(Model model) {
		//设备类型查询
   		List<Devicetype> devicetype = devicetypeService.findAll();
   		model.addAttribute("devicetype", devicetype);
   		return "../static/xadmin/standingbook-notsecret";
	}
	
	
 // 设备台账查询(涉密)	
	@RequestMapping("/two")
	public String tow(Model model,  String currentusedepartment,  Integer id,          String deviceid,  String devicemodel, String devicetype,
			                      	String manufacturersinfo,     String serialnumber, String hdisksn,   String applicationname) {	
		List<Deviceinfo_secret> deviceinfoLikelist = deviceinfo_secretService.findByIpContainingAndStatusContaining(currentusedepartment,id,
		deviceid, devicemodel, devicetype, manufacturersinfo, serialnumber, hdisksn, applicationname);
		//设备类型查询
   		List<Devicetype> devicetype1 = devicetypeService.findAll();
   		model.addAttribute("devicetype", devicetype1);
		model.addAttribute("deviceinfoLikelist", deviceinfoLikelist);
		return "../static/xadmin/standingbook-secretquery";
	}

// 设备台账查询(非涉密)	
	@RequestMapping("/twonotsecret")
	public String twonotsecret(Model model, Integer id,String currentusedepartment,  String deviceid,     String devicemodel, String devicetype,
                                           String manufacturersinfo,     String serialnumber, String hdisksn,     String applicationname) {
		List<Deviceinfo_notsecret> deviceinfonotLikelist = deviceinfo_notsecretService.findByIpContainingAndStatusContaining(id,currentusedepartment,
				deviceid, devicemodel, devicetype, manufacturersinfo, serialnumber, hdisksn, applicationname);
		//设备类型查询
   		List<Devicetype> devicetype1 = devicetypeService.findAll();
   		model.addAttribute("devicetype", devicetype1);
   		
		model.addAttribute("deviceinfonotLikelist", deviceinfonotLikelist);
		return "../static/xadmin/standingbook-notsecretquery";
	}

//  故障派单查询
	@RequestMapping("/four")
	public String four(Model model) { 
		List<Maintainrecord> maintainrecordlist = maintainrecordService.findByFirstname();
		
		//设备类型查询
   		List<Receiverinfo> receiverinfo1 = receiverinfoService.findAll();
   		model.addAttribute("receiverinfo", receiverinfo1);
   		
   		model.addAttribute("maintainrecordlist", maintainrecordlist);
   		
		return "../static/xadmin/hitch-dispatch";
	}

//    设备维修查询
	@RequestMapping("/five")
	public String five(Model model) { 
			List<Maintainrecord> maintainlist = maintainrecordService.findByFirstnameIs();
			model.addAttribute("maintainlist", maintainlist);
			return "../static/xadmin/equipment-maintenance";
	}

//    设备移交
	@RequestMapping("/six")
	public String six(Model model) {
			List<Devicetransfer> devicetransferlist = devicetransferService.findAll();
			model.addAttribute("devicetransferlist", devicetransferlist);
		return "../static/xadmin/equipment-devolve";
	}
	
	
	
	

//	台账录入（涉密）
	@RequestMapping("/savedeviceinfo")
	public String savedeviceinfo(Model model,Deviceinfo_secret deviceinfo_secret) {

		deviceinfo_secretService.save(deviceinfo_secret);
		return "redirect:/deviceinfo/one";
	}
//	台账录入（非涉密）
	@RequestMapping("/savedeviceinfonotsecret")
	public String savedeviceinfonotsecret(Model model,Deviceinfo_notsecret deviceinfo_notsecret ) {
		
		deviceinfo_notsecretService.save(deviceinfo_notsecret);
		return "redirect:/deviceinfo/onenotsecret";
	} 

	
//	台账修改(涉密)
	@RequestMapping("/updatesecret")
	public String updatesecret(Deviceinfo_secret deviceinfo_secret) {
		deviceinfo_secretService.updatesecret(deviceinfo_secret);
		
		return "redirect:/deviceinfo/two?id="+deviceinfo_secret.getId();
	}
	

//	台账修改(非涉密)
	@RequestMapping("/updatenotsecret")
	public String updatenotsecret(Deviceinfo_notsecret deviceinfo_notsecret) {
		deviceinfo_notsecretService.updatenotsecret(deviceinfo_notsecret);	
		return "redirect:/deviceinfo/twonotsecret?id="+deviceinfo_notsecret.getId();
	}
	

//	故障申报 
	@RequestMapping("/savemaintainrecord")
	public String savemaintainrecord(Maintainrecord maintainrecord) {
		maintainrecordService.save(maintainrecord);
		return "../static/xadmin/hitch-report";
	}

//	故障派单
	@RequestMapping("/updatemaintainrecord")
	public String updatemaintainrecord(Maintainrecord maintainrecord) {
		maintainrecordService.updatemaintainrecord(maintainrecord);
		return "redirect:/deviceinfo/four";
	}

//	设备维修
	@RequestMapping("/updatemaintainrecordw")
	public String updatemaintainrecordw(Maintainrecord maintainrecord) {
		maintainrecordService.updatemaintainrecord(maintainrecord);
		return "redirect:/deviceinfo/five";
	}

//	设备移交
	@RequestMapping("/savedevicetransfer")
	public String savedevicetransfer(Devicetransfer devicetransfer) {
		devicetransferService.save(devicetransfer);
		return "redirect:/deviceinfo/six";
	}
}
