package answerPublicQuestion;

import models.Place;

public class NumOfNearestAgency implements AnswerPublicQuestion {
	
	@Override
	public String getTextResponse(Place place) {
        place.findPhoneNumber();
		return "The phone number of the closest agency is " + place.getPhoneNumber();
	}
}