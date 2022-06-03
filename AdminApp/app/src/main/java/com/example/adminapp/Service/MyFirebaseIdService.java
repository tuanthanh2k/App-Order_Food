package com.example.adminapp.Service;

import com.example.adminapp.Common.Common;
import com.example.adminapp.model.Token;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String tokenRefenshed = FirebaseInstanceId.getInstance().getToken();
        updateTokenToFirebase(tokenRefenshed);
    }

    private void updateTokenToFirebase(String tokenRefenshed) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference("Tokens");
        Token token = new Token(tokenRefenshed,false);
        tokens.child(Common.currentUser.getPhone()).setValue(token);
    }
}
