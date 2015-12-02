package tdd_example;


import java.util.ArrayList;
import java.util.List;
import tdd_example.MailSender;

/*
 * Copyright 2014 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class MailSenderTest implements MailSender {

    List<SentMail> sentMails = new ArrayList<>();

    @Override
    public void send(String permaCode, String subject, String message) {
        sentMails.add(new SentMail(permaCode, subject, message));
    }

    public class SentMail {

        public String permaCode;
        public String subject;
        public String message;

        public SentMail(String permaCode, String subject, String message) {
            this.permaCode = permaCode;
            this.subject = subject;
            this.message = message;
        }
    }
}
