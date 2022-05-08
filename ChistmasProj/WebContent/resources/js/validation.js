function CheckAddProduct() {
	alert("체크");
	let productId = document.getElementById("productId");
	let name = document.getElementById("name");
	let price = document.getElementById("price");
	let length = document.getElementById("length");
	let older = document.getElementById("older");
	
	// 상품아아디 체크
	//반드시 첫 시작은  P
	// 5~12자까지 작성가능
	if (!check(/^P[0-9]{4,11}$/, productId, "[상품 코드]\nP와 숫자를 조합하여 5~12자까지 입력하세요\n첫 글자는 반드시 P로 시작하세요"))
		return false;
		
	// 상품명 체크
	if (name.value.length < 4 || name.value.length > 12) {
		alert("[상품명]\n최소 4자에서 최대 50자까지 입력하세요");
		name.select();
		name.focus();
		return false;
	}
	
	// 상품 가격 체크
	// 숫자만 사용 가능
	if (price.value.length == 0 || isNaN(price.value)) {
		alert("[가격]\n숫자만 입력하세요");
		price.select();
		price.focus();
		return false;
	}

	//음수입력 막음, 소수점 둘째자리까지 입력
	if (price.value < 0) {
		alert("[가격]\n음수를 입력할 수 없습니다");
		price.select();
		price.focus();
		return false;
	} else if (!check(/^\d+(?:[.]?[\d]?[\d])?$/, price,"[가격]\n소수점 둘째 자리까지만 입력하세요"))
		return false;

	// 재고 수 체크
	// 숫자만 입력
	if (isNaN(length.value)) {
		alert("[길이]\n숫자만 입력하세요");
		length.select();
		length.focus();
		return false;
	}


	// 재고 수 체크
	// 숫자만 입력
	if (isNaN(older.value)) {
		alert("[연식]\n숫자만 입력하세요");
		older.select();
		older.focus();
		return false;
	}


	function check(regExp, e, msg1) {
		if (regExp.test(e.value)) {
			return true;
		}
		alert(msg1);
		e.select();
		e.focus();
		return false;
	}

	document.newProduct.submit()
}