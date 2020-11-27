/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119084.muhammadidrismerdefi;

/**
 *
 * @author MERDEFI
 */
public interface ServiceItem {
    void displayService();
    float getPrice(int serviceItem);
    boolean checkMemberStatus(String statusMember);
    float getSale(boolean isMember,float parServicePrice);
}

