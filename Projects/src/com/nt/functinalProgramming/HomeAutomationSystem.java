package com.nt.functinalProgramming;

import java.util.Scanner;

public class HomeAutomationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Home home = new Home("Smart Home", "New York");

        Home.Light livingRoomLight = home.new Light();
        Home.Speaker livingRoomSpeaker = home.new Speaker("Living Room Speaker");

        System.out.println("1. Turn on the light");
        System.out.println("2. Adjust brightness");
        System.out.println("3. Turn off the light");

        int lightChoice = scanner.nextInt();

        switch (lightChoice) {
            case 1:
                livingRoomLight.turnOn();
                System.out.println("Living Room Light turned on.");
                break;
            case 2:
                System.out.print("Enter brightness level (0-100): ");
                int brightness = scanner.nextInt();
                livingRoomLight.setBrightness(brightness);
                System.out.println("Living Room Light brightness adjusted to " + brightness + ".");
                break;
            case 3:
                livingRoomLight.turnOff();
                System.out.println("Living Room Light turned off.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        System.out.println("4. Play music through the speaker");
        System.out.println("5. Stop music");
        System.out.println("6. Adjust speaker volume");

        int speakerChoice = scanner.nextInt();

        switch (speakerChoice) {
            case 4:
                livingRoomSpeaker.playMusic();
                System.out.println("Music playing through Living Room Speaker.");
                break;
            case 5:
                livingRoomSpeaker.stopMusic();
                System.out.println("Music stopped on Living Room Speaker.");
                break;
            case 6:
                System.out.print("Enter volume level (0-100): ");
                int volume = scanner.nextInt();
                livingRoomSpeaker.adjustVolume(volume);
                System.out.println("Living Room Speaker volume adjusted to " + volume + ".");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    static class Home {
        private String homeName;
        private String location;

        public Home(String homeName, String location) {
            this.homeName = homeName;
            this.location = location;
        }

        class Light {
            private boolean isOn;
            private int brightness;

            public Light() {
                this.isOn = false;
                this.brightness = 0;
            }

            public void turnOn() {
                isOn = true;
            }

            public void turnOff() {
                isOn = false;
            }

            public void setBrightness(int brightness) {
                this.brightness = brightness;
            }

            public boolean isOn() {
                return isOn;
            }

            public int getBrightness() {
                return brightness;
            }
        }

        class Speaker {
            private String speakerName;
            private int volume;
            private boolean isPlaying;

            public Speaker(String speakerName) {
                this.speakerName = speakerName;
                this.volume = 50; 
                this.isPlaying = false;
            }

            public void playMusic() {
                isPlaying = true;
            }

            public void stopMusic() {
                isPlaying = false;
            }

            public void adjustVolume(int volume) {
                if (volume >= 0 && volume <= 100) {
                    this.volume = volume;
                } else {
                    System.out.println("Invalid volume level. Please enter a value between 0 and 100.");
                }
            }

            public String getSpeakerName() {
                return speakerName;
            }

            public int getVolume() {
                return volume;
            }

            public boolean isPlaying() {
                return isPlaying;
            }
        }
    }
}

