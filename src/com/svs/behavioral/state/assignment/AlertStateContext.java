package com.svs.behavioral.state.assignment;

class AlertStateContext {
    private MobileAlertState currentState;

    AlertStateContext() {
        currentState = new Vibration(); // default state
    }

    void setCurrentState(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    void alert() {
        currentState.alert();
    }
}
