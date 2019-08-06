package com.wipro.rule;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {
	@Autowired
	private KieSession session;

	@PostMapping("/checkrule")
	public Rules ruleCheck(@RequestBody Rules rule) {
		session.insert(rule);
		session.fireAllRules();
		return rule;
	}

}
