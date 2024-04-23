public class OrderAction {
    public static void main(String[] args){

        OrderPlacedTotal order = new ActionOrderPlacedTotal();
        EmailVoiceNotifierGenerator voiceNotify = new ActionEmailVoiceNotifierGenerator();

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        voiceNotify.generateInvoice("order_123.pdf");
        voiceNotify.sendEmailNotification("johndoe@example.com");



    }
}
