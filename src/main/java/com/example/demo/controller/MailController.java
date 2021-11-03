package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MailRequest;
import com.example.demo.dto.MailResponse;
import com.example.demo.dto.OrderDetail;
import com.example.demo.service.MailService;

@RestController
@RequestMapping(value = "/send-email")
public class MailController {

	@Autowired
	private MailService service;
	
	@PostMapping("")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		
		List<OrderDetail> orders = new ArrayList<>();
		orders.add(new OrderDetail("Sản phẩm 1", 100000L, 1, 100000L));
		orders.add(new OrderDetail("Sản phẩm 2", 50000L, 1, 50000L));
		Long total = 0L;
		Long ship_fee = 15000L;
		for(OrderDetail item : orders) {
			total += item.getPrice() * item.getQuantity();
		}
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "So nha 01, Xã Vạn Yên, Huyện Mê Linh, Hà Nội, Việt Nam");
		model.put("orders", orders);
		model.put("ship_fee", ship_fee);
		model.put("total", total + ship_fee);
		model.put("total_noship", total);
		return service.sendEmail(request, model);
	}
	
}
