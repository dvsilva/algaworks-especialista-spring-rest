# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 02-27-alterando-configuracao-dependendo-do-ambiente
git add .
git commit -m "Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles)"
git push origin 02-27-alterando-configuracao-dependendo-do-ambiente

git checkout master
git merge --no-ff 02-27-alterando-configuracao-dependendo-do-ambiente
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