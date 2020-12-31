# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 09-19-executando-processo-de-validacao-programaticamente
git add .
git commit -m "Executando processo de validação programaticamente"
git push origin 09-19-executando-processo-de-validacao-programaticamente

git checkout master
git merge --no-ff 09-19-executando-processo-de-validacao-programaticamente
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