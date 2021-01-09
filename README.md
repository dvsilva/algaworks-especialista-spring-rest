# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 10-06-rodando-testes-pelo-maven
git add .
git commit -m "Rodando os testes pelo Maven"
git push origin 10-06-rodando-testes-pelo-maven

git checkout master
git merge --no-ff 10-06-rodando-testes-pelo-maven
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