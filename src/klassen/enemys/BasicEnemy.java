/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassen.enemys;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.LinkedList;
import klassen.player.Player;
import klassen.player.PlayerSpritzer;

/**
 *
 * @author Christian
 */
public class BasicEnemy extends Enemy
{
  
  public BasicEnemy(float x, float y, int speed, int speedX, int speedY,LinkedList<PlayerSpritzer> playerSpritzers,Player player)
  {
    super(x, y, speed, playerSpritzers, player, new Rectangle((int)x, (int)y, 25, 25));
    super.speedX=speedX;
    super.speedY=speedY;
    setColor(Color.RED);
    setKnockback(true);
  }

  @Override
  public void update(float tslf)
  {
    if(collidePlayerSpritzer())
    {
      live-=10;
    }
    
    rebound(player.getBounding());
    super.update(tslf);
  }
}
