# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 11-21-corrigindo-bug-de-tratamento-de-exception-de-integridade-de-dados-com-flush-do-jpa
git add .
git commit -m "Corrigindo bug de tratamento de exception de integridade de dados com flush do JPA"
git push origin 11-21-corrigindo-bug-de-tratamento-de-exception-de-integridade-de-dados-com-flush-do-jpa

git checkout master
git merge --no-ff 11-21-corrigindo-bug-de-tratamento-de-exception-de-integridade-de-dados-com-flush-do-jpa
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```