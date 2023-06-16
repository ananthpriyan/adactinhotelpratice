package com.pagemaneger;

import com.baseclass.BaseClass;
import com.pompages.AdBookConfirmpagePom;
import com.pompages.AdBookingPagePom;
import com.pompages.AdactinLoginPom;
import com.pompages.AdactinSearchPom;

public class PageManager extends BaseClass {

	private AdactinLoginPom adactinLoginPom;

	public AdactinLoginPom getAdactinLoginPom() {
		return (adactinLoginPom == null) ? adactinLoginPom = new AdactinLoginPom() : adactinLoginPom;
	}

	private AdactinSearchPom adactinSearchpage;

	public AdactinSearchPom getAdactinSearchpage() {
		return (adactinSearchpage==null) ? adactinSearchpage = new AdactinSearchPom() : adactinSearchpage;
	}
	
	private AdBookingPagePom adbookingpage;

	public AdBookingPagePom getAdbookingpage() {
		return (adbookingpage==null) ? adbookingpage = new AdBookingPagePom() : adbookingpage;
	}
	
	
	private AdBookConfirmpagePom adbookconfirm;

	public AdBookConfirmpagePom getAdbookconfirm() {
		return (adbookconfirm==null) ? adbookconfirm = new AdBookConfirmpagePom(): adbookconfirm;
	}
	
	
	
	
	
}
