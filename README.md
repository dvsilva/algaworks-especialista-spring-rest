# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 04-13-implementando-content-negociation
git add .
git commit -m "Implementando content negotiation para retornar JSON ou XML"
git push origin 04-13-implementando-content-negociation

git checkout master
git merge --no-ff 04-13-implementando-content-negociation
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